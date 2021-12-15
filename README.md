## Bem-vindo!
## Este é um repositório com objetivo de acompanhamento dos exercícios resolvidos do site https://exercism.org. 👩‍🎓 🖥️ 📈

### Exercise #1 - Greeter.java
Instructions
The classical introductory exercise. Just say "Hello, World!".

"Hello, World!" is the traditional first program for beginning programming in a new language or environment.

The objectives are simple:

Write a function that returns the string "Hello, World!".
Run the test suite and make sure that it succeeds.
Submit your solution and check it at the website.
If everything goes well, you will be ready to fetch your first real exercise.


### Exercise #2 - Lasagna.java
Instructions
In this exercise you're going to write some code to help you cook a brilliant lasagna from your favorite cooking book.

You have four tasks, all related to the time spent cooking the lasagna.

1. Define the expected oven time in minutes
Define the expectedMinutesInOven() method that does not take any parameters and returns how many minutes the lasagna should be in the oven. According to the cooking book, the expected oven time in minutes is 40:

Lasagna lasagna = new Lasagna();
lasagna.expectedMinutesInOven();
// => 40

2. Calculate the remaining oven time in minutes
Define the remainingMinutesInOven() method that takes the actual minutes the lasagna has been in the oven as a parameter and returns how many minutes the lasagna still has to remain in the oven, based on the expected oven time in minutes from the previous task.

Lasagna lasagna = new Lasagna();
lasagna.remainingMinutesInOven(30);
// => 10

3. Calculate the preparation time in minutes
Define the preparationTimeInMinutes() method that takes the number of layers you added to the lasagna as a parameter and returns how many minutes you spent preparing the lasagna, assuming each layer takes you 2 minutes to prepare.

Lasagna lasagna = new Lasagna();
lasagna.preparationTimeInMinutes(2);
// => 4

4. Calculate the total working time in minutes
Define the totalTimeInMinutes() method that takes two parameters: the first parameter is the number of layers you added to the lasagna, and the second parameter is the number of minutes the lasagna has been in the oven. The function should return how many minutes in total you've worked on cooking the lasagna, which is the sum of the preparation time in minutes, and the time in minutes the lasagna has spent in the oven at the moment.

Lasagna lasagna = new Lasagna();
lasagna.totalTimeInMinutes(3, 20);
// => 26
