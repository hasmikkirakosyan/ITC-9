#include <iostream>
#include "queue.hpp"


int main() {
    Queue myQueue(3, 8);
    std::cout << "Size:\t" << myQueue.getSize() << std::endl;
    for(int i = 0; 6 > i; ++i) {
        myQueue.shift(i);
    }
    myQueue.printQueue();
    for(int i = 0; 6 > i; ++i) {
        myQueue.pop();
    }
//    myQueue.shift(200);
    myQueue.printQueue();
/*    Queue otherQueue = myQueue;
    otherQueue.printQueue();
    for(int i = 0; i < 6; ++i) {
        otherQueue.popBack();
    }
    otherQueue.printQueue();*/
    return 0;
} 
