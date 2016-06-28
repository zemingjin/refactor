#Refactoring
* Definition - a change(s) made to the internal structure of software to make it: 
easier **to understand and to modify** without changing its **observable behavior**.

##Why
1. Evolving of software - routine maintenance to remain healthy.
2. Help to understand the current implementation - 40% of time is reading
3. Make software easier to understand next developers - "Any fool can write code that a computer can understand. 
Good programmers write code that humans can understand. "
4. Help to find bugs - better understanding of the intentions helps to spot bugs.
5. Great habit - good programmer + great habits = great programmer.
6. Improve the rhythm - good fit for XP

##When
1. Rule of three: 1st - just do it; 2nd - duplicate; 3rd - refactor.
2. Adding new feature: need to understand current implementation.
3. Code that is hard to understand - if it smells, change it - duplicates, long methods, large classes, long parameter list
4. Current design is hard to extend.
5. Bug fix.

##How
1. Identify under/over-engineered code segment
2. Ensure adequate test - for anything more than basic refactoring - have faith in provided refactoring of IDE.
3. Small steps - local/temp git; separate PR's for refactoring and implementation.
4. When to stop - enough for your current task.
5. Rename - clear description of the intention.
6. Refactoring followed by performance tuning.
7. Make comments superfluous - extract/rename the method; add assertion for required states.

##When Not
1. Databases
2. Interfaces
3. Rewrite
4. Close to a deadline - dept management, dept+ -> interest+ -> dept+...

##Preparation - reset to the original state

**git reset 372ec19 --hard**

##References
[Refactoring: Improving the Design of Existing Code by Martin Fowler]
(https://www.csie.ntu.edu.tw/~r95004/Refactoring_improving_the_design_of_existing_code.pdf)


