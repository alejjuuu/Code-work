print("This program generates an acronym")

phrase = str(input("Enter a phrase: "))
acronym = ""

for x in phrase.split():
    acronym += x[0].upper()
print(acronym)


phrase = input("Enter a phrase: ")
for x in phrase.split():
    print(x[0].upper(), end='')
