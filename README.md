#Refactoring
* Definition - a change(s) made to the internal structure of software to make it: 
easier **to understand and to modify** without changing its **observable behavior**.

##Why
1. Evolving of software - routine maintenance to remain healthy.
2. Economics - Clean code allows fast deliveries.
3. Professionalism - "Any fool can write code that a computer can understand. 
Good programmers write code that humans can understand. "

##When
1. Adding new feature: R->G->G - separation of implementation and refactoring.
2. "Comprehension Refactoring" - Code that is hard to understand - refactoring should start after understanding was reached
3. "Preparatory Refactoring" - Current design is hard to extend.
4. "Litter-Pickup Refactoring".  Many small changes could result much better.
5. "Planned Refactoring" - no need in perfect world where refactoring is a continue process.

##How
1. Identify under/over-engineered code segment
2. Ensure adequate test - for anything more than basic refactoring - have faith in provided refactoring of IDE.
3. Small steps - local/temp git; separate PR's for refactoring and implementation.
4. When to stop - only refactor what is necessary.
5. Rename - clear description of the intention.
6. Refactoring followed by performance tuning.
7. Make comments superfluous - extract/rename the method; add assertion for required states.

##When Not
1. Databases
2. Interfaces
3. Rewrite
4. Close to a deadline - dept management, dept+ -> interest+ -> dept+...

##Preparation - reset to the original state

**git reset 3801738 --hard**

##References
[Refactoring: Improving the Design of Existing Code by Martin Fowler]
(https://www.csie.ntu.edu.tw/~r95004/Refactoring_improving_the_design_of_existing_code.pdf)


