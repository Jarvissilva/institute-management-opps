#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Institute {
public:
    int serial_no;
    string name;
    string type;

    Institute(int serial_no, string name, string type) {
        this->serial_no = serial_no;
        this->name = name;
        this->type = type;
    }
};

class InstituteManager {
private:
    vector<Institute> institutes;

public:
    void add_institute() {
        string name, type;
        cout << "Enter your institute name: ";
        getline(cin >> ws, name);  // Read input including spaces
        cout << "Enter your institute type: ";
        getline(cin >> ws, type);  // Read input including spaces

        Institute new_institute(institutes.size(), name, type);
        institutes.push_back(new_institute);

        cout << "Institute successfully added\n" << endl;
    }

    void remove_institute() {
        if (institutes.empty()) {
            cout << "No institutes added\n" << endl;
            return;
        }

        int serial_no;
        bool institute_found = false;

        cout << "Enter institute sr no to remove: ";
        cin >> serial_no;

        for (auto it = institutes.begin(); it != institutes.end(); ++it) {
            if (it->serial_no == serial_no) {
                institutes.erase(it);
                cout << "Institute successfully removed\n" << endl;
                institute_found = true;
                break;
            }
        }

        if (!institute_found) {
            cout << "Institute not found with that serial number\n" << endl;
        }
    }

    void display_institute() {
        if (institutes.empty()) {
            cout << "No institutes added\n" << endl;
            return;
        }

        int serial_no;
        bool institute_found = false;

        cout << "Enter institute sr no to find: ";
        cin >> serial_no;

        for (const auto& institute : institutes) {
            if (institute.serial_no == serial_no) {
                cout << "-------------------------------------" << endl;
                cout << "Sr No: " << institute.serial_no << endl;
                cout << "Name: " << institute.name << endl;
                cout << "Type: " << institute.type << endl;
                cout << "-------------------------------------" << endl;
                institute_found = true;
                break;
            }
        }

        if (!institute_found) {
            cout << "Institute not found with that serial number\n" << endl;
        }
    }

    void display_institutes() {
        if (institutes.empty()) {
            cout << "No institutes added\n" << endl;
            return;
        }

        for (const auto& institute : institutes) {
            cout << "-------------------------------------" << endl;
            cout << "Sr No: " << institute.serial_no << endl;
            cout << "Name: " << institute.name << endl;
            cout << "Type: " << institute.type << endl;
            cout << "-------------------------------------" << endl;
        }
    }
};

int main() {
    InstituteManager institute_manager;
    bool is_exit = false;
    string action;

    while (!is_exit) {
        cout << "Welcome to Institutes Management. What action would you like to perform:" << endl;
        cout << "1. Add Institutes\n2. View Institutes\n3. Remove Institute\n4. View Institute\n5. Exit" << endl;
        getline(cin >> ws, action);  // Read input including spaces

        if (action == "1") {
            institute_manager.add_institute();
        } else if (action == "2") {
            institute_manager.display_institutes();
        } else if (action == "3") {
            institute_manager.remove_institute();
        } else if (action == "4") {
            institute_manager.display_institute();
        } else if (action == "5") {
            cout << "Thank you for using our system.\n" << endl;
            is_exit = true;
        } else {
            cout << "Please enter a valid action input.\n" << endl;
        }
    }

    return 0;
}
