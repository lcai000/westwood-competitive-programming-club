createProblemFolder(){
    BASE_DIR="Problems_Solutions"
    cd $BASE_DIR
    read -p "Enter problem name: " problem_name

    mkdir $problem_name
    cd $problem_name
    touch problem.txt

    mkdir solutions
    cd solutions
    touch robot.txt

    mkdir ideal_solutions
    mkdir student_solutions

    cd ideal_solutions
    touch Main.cpp
    touch Main.java
    touch Main.py

    cd ..

    cd student_solutions
    touch robot.txt

    cd ..
    cd ..
    cd ..
    echo "problem folder $problem_name created"
}
createProblemFolder