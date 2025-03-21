class Student:
    def __init__(self, name, marks):
        self.name = name
        self.marks = marks
    
    def __repr__(self):
        return f"Student(name={self.name}, marks={self.marks})"

# Creating a list of Student objects
students = [
    Student("Alice", 85),
    Student("Bob", 60),
    Student("Charlie", 78),
    Student("David", 90),
    Student("Eva", 72),
    Student("Frank", 80)
]

# Filter students with marks above 75 and sort them by marks
filtered_and_sorted = sorted(
    filter(lambda student: student.marks > 75, students),
    key=lambda student: student.marks
)

# Displaying the names of the students who passed
print("Students who scored above 75%, sorted by marks:")
for student in filtered_and_sorted:
    print(student.name)
