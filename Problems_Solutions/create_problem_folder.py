import os

def create_problem_structure(base_dir, problem_name):
    problem_dir = os.path.join(base_dir, problem_name)
    structure = {
        "solutions": {
            "ideal_solutions": ["solution.cpp", "solution.java", "solution.py"],
            "student_solutions": ["robot.txt"]
        },
        "files": ["problem.txt", "robot.txt"]
    }
    
    os.makedirs(problem_dir, exist_ok=True)

    ideal_solutions_dir = os.path.join(problem_dir, "solutions", "ideal_solutions")
    os.makedirs(ideal_solutions_dir, exist_ok=True)
    for filename in structure["solutions"]["ideal_solutions"]:
        open(os.path.join(ideal_solutions_dir, filename), "w").close()
    
    student_solutions_dir = os.path.join(problem_dir, "solutions", "student_solutions")
    os.makedirs(student_solutions_dir, exist_ok=True)
    for filename in structure["solutions"]["student_solutions"]:
        open(os.path.join(student_solutions_dir, filename), "w").close()

    for filename in structure["files"]:
        open(os.path.join(problem_dir, filename), "w").close()

    print(f"✅ Structure for '{problem_name}' created at {problem_dir}")

if __name__ == "__main__":
    base_dir = "Problems_Solutions"
    problem_name = input("")
    create_problem_structure(base_dir=base_dir,problem_name=problem_name)