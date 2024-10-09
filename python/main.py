class Institute:
    def __init__(self, serial_no, name, type):
        self.serial_no = serial_no
        self.name = name
        self.type = type
class InstituteManager:
    def __init__(self):
        self.institutes = []

    def add_institute(self):
        print("Enter your institute name: ")
        name = input()
        print("Enter your institute type: ")
        type = input()

        new_institute = Institute(len(self.institutes), name, type)
        self.institutes.append(new_institute)

        print("Institute successfully added\n")

    def remove_institute(self):
        if not self.institutes:
            print("No institutes added\n")
            return

        print("Enter institute sr no to remove: ")
        serial_no = int(input())
        institute_found = False

        for institute in self.institutes:
            if institute.serial_no == serial_no:
                self.institutes.remove(institute)
                print("Institute successfully removed\n")
                institute_found = True
                break

        if not institute_found:
            print("Institute not found with that serial number\n")

    def display_institute(self):
        if not self.institutes:
            print("No institutes added\n")
            return

        print("Enter institute sr no to find: ")
        serial_no = int(input())
        institute_found = False

        for institute in self.institutes:
            if institute.serial_no == serial_no:
                print("-------------------------------------")
                print(f"Sr No: {institute.serial_no}")
                print(f"Name: {institute.name}")
                print(f"Type: {institute.type}")
                print("-------------------------------------\n")
                institute_found = True
                break

        if not institute_found:
            print("Institute not found with that serial number\n")

    def display_institutes(self):
        if not self.institutes:
            print("No institutes added\n")
            return

        for institute in self.institutes:
            print("-------------------------------------")
            print(f"Sr No: {institute.serial_no}")
            print(f"Name: {institute.name}")
            print(f"Type: {institute.type}")
            print("-------------------------------------\n")

def main():
    institute_manager = InstituteManager()
    is_exit = False

    while not is_exit:
        print("Welcome to Institutes Management. What action would you like to perform:")
        print("1. Add Institutes\n2. View Institutes\n3. Remove Institute\n4. View Institute\n5. Exit")

        action = input().strip()

        if action == "1":
            institute_manager.add_institute()
        elif action == "2":
            institute_manager.display_institutes()
        elif action == "3":
            institute_manager.remove_institute()
        elif action == "4":
            institute_manager.display_institute()
        elif action == "5":
            print("Thank you for using our system.\n")
            is_exit = True
        else:
            print("Please enter a valid action input.\n")

if __name__ == "__main__":
    main()
