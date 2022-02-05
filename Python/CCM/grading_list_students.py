# quizz, homework, test college calculator
# 12/09/20
# luis Velasquez
students = {

    "frank": {"name": "frank",
              "homework": [90.0, 97.0, 75.0, 92.0],
              "quizzes": [88.0, 40.0, 94.0],
              "tests": [75.0, 90.0]},
    "alice": {"name": "alice",
              "homework": [100.0, 92.0, 98.0, 100.0],
              "quizzes": [82.0, 83.0, 91.0],
              "tests": [89.0, 97.0]},
    "sarah": {"name": "sarah",
              "homework": [0.0, 87.0, 75.0, 22.0],
              "quizzes": [0.0, 75.0, 78.0],
              "tests": [100.0, 100.0]},
}


for d in students:
    print(students[d]["name"])
    sumofhw = sum(students[d]["homework"])
    hwavg = sumofhw / len(students[d]["homework"])

    quizzes = sum(students[d]["quizzes"])
    quizavg = quizzes / len(students[d]["quizzes"])

    tests = sum(students[d]["tests"])
    testavg = tests / len(students[d]["tests"])

    hwfinal = 0.10 * hwavg + 0.30 * quizavg + 0.60 * testavg

    if hwfinal >= 90:
        print("A", )
    elif hwfinal >= 80:
        print("B")
    elif hwfinal >= 70:
        print("C")
    elif hwfinal >= 60:
        print("D")
    else:
        print("F")
