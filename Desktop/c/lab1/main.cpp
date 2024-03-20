#include "manager.h"

#include <iostream>
#include <sstream>
#include <string>

using namespace std;

int main() {
    PersonalTaskManager taskManager;

    while (true) {
        cout << "Enter a command (new <priority> <id>, list <priority>, complete <id>, or exit): ";
        string line;
        getline(cin, line);

        stringstream ss(line);
        string command;
        ss >> command;

        if (command == "exit") {
            break;
        } else if (command == "new") {
            int priority;
            string id;
            ss >> priority >> id;
            if((priority == 0 || id == "\0") || (priority == 0 && id == "\0")){
                cout << "Error!! Check Priority or ID" << "\n";
            }else{
                taskManager.addTask(priority, id);
                cout << "Task added successfully!" << "\n" << endl;
            }
            
        } else if (command == "list") {
            int priority;
            ss >> priority;
            cout << "Priority tasks" << priority << " or superior:" << endl;
            taskManager.listTasks(priority);
        } else if (command == "complete") {
            string id;
            ss >> id;
            taskManager.completeTask(id);
            cout << "Tarefa completada (se existir)." << endl;
        } else {
            cout << "Invalid command. Please try again." << endl;
        }
    }

    return 0;
}

