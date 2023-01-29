[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=9253749&assignment_repo_type=AssignmentRepo)
# ICS4U OOP Assignment

[*see instructions for details*](Instructions.md)

*Insert Class Diagram here* 
![OOP assignment drawio](https://user-images.githubusercontent.com/99457610/215353710-cff31dfd-b67a-4049-9508-d4440be8d1a0.png)

## Summary

The system that I have chosen to model is an aircraft. In an aircraft, we have passengers and we also have different types of aircrafts that can be used for commericial transport. For this project, I have chosen to make an aircraft class which is the most general and abstract. The aircraft class has passengers who each have their own jobs. This is an example of a has-a relationship or aggregation. The different types of aircrafts such as the Boeing737 (most common commerical transport airplane) or the helicopter are examples of inheritance, where all the properties that an aircraft has can also be found in the Boeing737 or helicopter. In the aircraft class, I do not have many instance variables in the constructor because I chose to make them more dynamic by letting the user initialize them. The goal of this program is to fly the aircraft to its destination. An aircraft needs to have a pilot in order to start flying. As long as the aircraft manages to reach its destination, the program will end. The user can also choose to end the program by themselves as there is a menu of options for what the user wants to do.  
