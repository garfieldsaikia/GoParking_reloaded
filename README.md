# GoParking_reloaded
Project to allocate parking spaces in a parking lot, and to do related stuff

OVERALL SCENARIO
1. Parking lot has 3 entry gates - A, B and C. Cars can enter through any one of the gates.
2. There are 200, 200 and 100 parking spaces for small, medium and large cars, respectively.
3. A small-sized car can be allocated a SMALL, MEDIUM or LARGE parking slot. A medium-sized car can be allocated a MEDIUM or LARGE parking    slot. A large-sized car can only be allocated a LARGE parking slot.
4. A small or medium-sized car will only be given a parking slot larger than its size, when all the parking slots of its corresponding        size are occupied.
5. For the first hour, a car will be charged Rs. 40. For every subsequent hour, an additional amount of Rs. 10 will be charged.

FUNCTIONING
1. When a car enters, it will input its 'size' and 'gateName'.
2. The following information will get initialized. 
