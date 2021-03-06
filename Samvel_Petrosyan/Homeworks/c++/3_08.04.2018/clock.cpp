#include <iostream>
#include <cmath>
int getCountOfRings(double hour1, double hour2) {
    int count = 0;
    int temp = 0;
    double sixMin = 0.06;
    double epsilon = 0.001;
    for (double i = hour1; i <= hour2; i += 0.01) {
        temp = i + epsilon;
        if (std :: abs(i - temp) < epsilon) {
            ++count;
        }
        if (std :: abs(i - temp - sixMin) < epsilon){ ++count;
            i += 1 - sixMin - 0.01;
        }
    }
    return
        count;
}
bool isNotTrue(int hour1, int min1, int hour2, int min2) {
    return hour1 <= 0 || hour2 <= 0 || hour1 > 12 || hour2 > 12 || min1 < 0 || min2 < 0 
        || min1 > 60 || min2 > 60 || hour1 > hour2 || (hour1 == hour2 && min1 > min2);
}
void inputTime(double& hour1, double& hour2) {
    int minute1 = 0;
    int minute2 = 0;
    char temp = ' ';
    std :: cout << "Input time example 1:10 1:20 : ";
    std :: cin >> hour1 >> temp >> minute1 >> hour2 >> temp >> minute2;
    while (!std :: cin || isNotTrue(hour1, minute1, hour2, minute2)) {
        std :: cin.clear();
        std :: cin.ignore();
        std :: cout << "don't corect ";
        std :: cin >> hour1 >> temp >> minute1 >> hour2 >> temp
            >> minute2;
    }
    hour1 += minute1 / 100.0;
    hour2 += minute2 / 100.0;
}
int main() {
    double hour1 = 0;
    double hour2 = 0;
    int countOfRings = 0;
    inputTime(hour1, hour2);
    countOfRings = getCountOfRings(hour1, hour2);
    if (countOfRings) {
        std :: cout << "The clock rings " << countOfRings << "times." << std :: endl;
    } else {
        std :: cout << "The clock doesn't ring." << std :: endl;
    }
    return 0;
}
