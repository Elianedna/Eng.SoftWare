#include "manager.h"


void PersonalTaskManager::addTask(int priority, const string& id) {
    tasks[priority].push_back({priority, id});
}

void PersonalTaskManager::listTasks(int priority) {
    for (auto it = tasks.begin(); it != tasks.end(); ++it) {
        if (it->first >= priority) {
            sort(it->second.begin(), it->second.end(), [](const Task& a, const Task& b) {
                return a.priority > b.priority || (a.priority == b.priority && a.id > b.id);
            });
            for (const auto& task : it->second) {
                cout << "Priority: " << task.priority << ", ID: " << task.id << endl;
            }
        }
    }
}

void PersonalTaskManager::completeTask(const string& id) {
    bool found = false;
    for (auto& kvp : tasks) {
        auto& taskList = kvp.second;
        auto it = find_if(taskList.begin(), taskList.end(), [&id](const Task& task) {
            return task.id == id;
        });
        if (it != taskList.end()) {
            taskList.erase(it);
            found = true;
            break;
        }
    }
    if (!found) {
        cout << "NONEXISTENT TASK" << endl;
    }
}

