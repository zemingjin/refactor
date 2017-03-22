#Refactoring
* Definition - a change(s) made to the internal structure of software to make it: 
easier **to understand and to modify** without changing its **observable behavior**.

##Why
1. Evolving of software - routine maintenance to remain healthy.
2. Economics - Clean code allows fast deliveries - **60-70%** of time in reading.
3. Professionalism - "Any fool can write code that a computer can understand.
Good programmers write code that humans can understand."

##When - if code smells, refactor it.
1. Adding new feature: separation of implementation and refactoring.
2. "Comprehension Refactoring" - Code that is hard to understand - refactoring should start after understanding was reached
3. "Preparatory Refactoring" - Current design is hard to extend.
4. "Litter-Pickup Refactoring".  Many small changes could result much better code - such as active code review.
5. "Planned Refactoring" - no need in perfect world where refactoring is a continue process.

##How
1. Identify under/over-engineered code segment
2. Ensure adequate test - for anything more than basic refactoring - have faith about IDE's provided refactoring.
3. Small steps - local/temp git; goal: making the code better - not perfect. Separate PR's for refactoring and implementation.
4. Rename - **naming is design** - clear description of the intention. 7-stages of naming.  Continuously.
5. When to stop - only refactor what is necessary.

##When Not
1. Databases
2. Interfaces
3. Rewrite
4. Close to a deadline - debt management, debt+ -> interest+ -> debt+...

##Preparation - reset to the original state

**git reset 3801738 --hard**

##References
1. [Refactoring: Improving the Design of Existing Code by Martin Fowler]
(https://www.csie.ntu.edu.tw/~r95004/Refactoring_improving_the_design_of_existing_code.pdf)
2. [Naming: Good naming is a process, not a single step]
(http://arlobelshee.com/good-naming-is-a-process-not-a-single-step/)
3. [IntelliJ: Refactoring](https://www.jetbrains.com/help/idea/2016.1/refactoring-source-code.html)


