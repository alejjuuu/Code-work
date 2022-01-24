students = {
    frank = {
        "name": "Frank",
        "homework": [90.0, 97.0, 75.0, 92.0],
        "quizzes": [88.0, 40.0, 94.0],
        "tests": [75.0, 90.0]
    },
    'alice' = {
        "name": "Alice",
        "homework": [100.0, 92.0, 98.0, 100.0],
        "quizzes": [82.0, 83.0, 91.0],
        "tests": [89.0, 97.0]
    },
    sarah = {
        "name": "Sarah",
        "homework": [0.0, 87.0, 75.0, 22.0],
        "quizzes": [0.0, 75.0, 78.0],
        "tests": [100.0, 100.0]
    }
}

for p in students:
    print(p)
    for key in students[p]:
        sum = 0
        average = 0
        final = 0
        for x in students["homework"]:
            sum = sum + x
            average = sum / len(student["homework"])
            homeworkgrade = 0.10 * average
        for x in frank["quizzes"]:
            sum = sum + x
            average = sum / len(frank["quizzes"])
            final = 0.30 * average
        for x in frank["quizzes"]:
            sum = sum + x
            average = sum / len(frank["quizzes"])
            final = 0.60 * average
            frankquizzes = + final

        # if score >= 90:
        #    print( "A")
        # elif score >=80:
        #    print( "B")
        # elif score >=70:
        #    print( "C")
        # elif score >=60:
        #    print( "D")
        # else:
        #    print( "F")


print("Student", name, "average: ", average)
print(homeworkgrade)
