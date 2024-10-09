using System;
using System.Collections.Generic;

class Institute
{
    public int serial_no;
    public string name;
    public string type;

    public Institute(int serial_no, string name, string type)
    {
        this.serial_no = serial_no;
        this.name = name;
        this.type = type;
    }
}

class InstituteManager
{
    private List<Institute> institutes = new List<Institute>();

    public void AddInstitute()
    {
        Console.WriteLine("Enter your institute name: ");
        string name = Console.ReadLine();
        Console.WriteLine("Enter your institute type: ");
        string type = Console.ReadLine();

        Institute newInstitute = new Institute(institutes.Count, name, type);
        institutes.Add(newInstitute);

        Console.WriteLine("Institute successfully added\n");
    }

    public void RemoveInstitute()
    {
        if (institutes.Count == 0)
        {
            Console.WriteLine("No institutes added\n");
            return;
        }

        Console.WriteLine("Enter institute sr no to remove: ");
        int serial_no = int.Parse(Console.ReadLine());
        bool instituteFound = false;

        for (int i = 0; i < institutes.Count; i++)
        {
            if (institutes[i].serial_no == serial_no)
            {
                institutes.RemoveAt(i);
                Console.WriteLine("Institute successfully removed\n");
                instituteFound = true;
                break;
            }
        }

        if (!instituteFound)
        {
            Console.WriteLine("Institute not found with that serial number\n");
        }
    }

    public void DisplayInstitute()
    {
        if (institutes.Count == 0)
        {
            Console.WriteLine("No institutes added\n");
            return;
        }

        Console.WriteLine("Enter institute sr no to find: ");
        int serial_no = int.Parse(Console.ReadLine());
        bool instituteFound = false;

        foreach (var institute in institutes)
        {
            if (institute.serial_no == serial_no)
            {
                Console.WriteLine("-------------------------------------");
                Console.WriteLine($"Sr No: {institute.serial_no}");
                Console.WriteLine($"Name: {institute.name}");
                Console.WriteLine($"Type: {institute.type}");
                Console.WriteLine("-------------------------------------\n");
                instituteFound = true;
                break;
            }
        }

        if (!instituteFound)
        {
            Console.WriteLine("Institute not found with that serial number\n");
        }
    }

    public void DisplayInstitutes()
    {
        if (institutes.Count == 0)
        {
            Console.WriteLine("No institutes added\n");
            return;
        }

        foreach (var institute in institutes)
        {
            Console.WriteLine("-------------------------------------");
            Console.WriteLine($"Sr No: {institute.serial_no}");
            Console.WriteLine($"Name: {institute.name}");
            Console.WriteLine($"Type: {institute.type}");
            Console.WriteLine("-------------------------------------\n");
        }
    }
}

class Program
{
    static void Main()
    {
        InstituteManager instituteManager = new InstituteManager();
        bool isExit = false;
        string action;

        while (!isExit)
        {
            Console.WriteLine("Welcome to Institutes Management. What action would you like to perform:");
            Console.WriteLine("1. Add Institutes\n2. View Institutes\n3. Remove Institute\n4. View Institute\n5. Exit");

            action = Console.ReadLine().Trim();

            switch (action)
            {
                case "1":
                    instituteManager.AddInstitute();
                    break;
                case "2":
                    instituteManager.DisplayInstitutes();
                    break;
                case "3":
                    instituteManager.RemoveInstitute();
                    break;
                case "4":
                    instituteManager.DisplayInstitute();
                    break;
                case "5":
                    Console.WriteLine("Thank you for using our system.\n");
                    isExit = true;
                    break;
                default:
                    Console.WriteLine("Please enter a valid action input.\n");
                    break;
            }
        }
    }
}
