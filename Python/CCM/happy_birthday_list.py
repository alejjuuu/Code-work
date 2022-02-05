#it prints happy birthday

def happy():
    return "Happy Birthday to you!\n"

def verseFor(person):
    lyrics = happy()*2+ "Happy birthday, dear " + person + " .\n" +happy()
    return lyrics

def main():
    for person in ["Fred","Lucy","Elmer"]:
        print(verseFor(person))

main()
