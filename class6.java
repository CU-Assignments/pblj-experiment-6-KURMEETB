class Employee:
    def __init__(self, name, age, salary):
        self.name = name
        self.age = age
        self.salary = salary
    
    def __repr__(self):
        return f"Employee(name={self.name}, age={self.age}, salary={self.salary})"

# Creating a list of Employee objects
employees = [
    Employee("John", 28, 50000),
    Employee("Alice", 24, 60000),
    Employee("Bob", 30, 40000),
    Employee("Diana", 27, 70000)
]

# Sorting by name
sorted_by_name = sorted(employees, key=lambda e: e.name)
print("Sorted by name:")
for emp in sorted_by_name:
    print(emp)

# Sorting by age
sorted_by_age = sorted(employees, key=lambda e: e.age)
print("\nSorted by age:")
for emp in sorted_by_age:
    print(emp)

# Sorting by salary
sorted_by_salary = sorted(employees, key=lambda e: e.salary)
print("\nSorted by salary:")
for emp in sorted_by_salary:
    print(emp)
