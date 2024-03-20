#ifndef PERSONAL_TASK_MANAGER_H
#define PERSONAL_TASK_MANAGER_H

#include <iostream>
#include <unordered_map>
#include <map>
#include <vector>
#include <algorithm>

using namespace std;

struct Task {
    int priority;
    string id;
};

class PersonalTaskManager {
private:
    unordered_map<int, vector<Task>> tasks;

public:
    void addTask(int priority, const string& id);
    void listTasks(int priority);
    void completeTask(const string& id);
};

#endif
// PERSONAL_TASK_MANAGER_H
