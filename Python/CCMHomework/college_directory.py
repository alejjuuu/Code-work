class CollegeDirectory:
    "manage college student directory"

    def __init__(self, name):
        self.name=name
        self.students={}

    def addStudent(self, studentName, emailAddress):
        '''add student and his email to the directory'''
        if studentName not in self.students:
            self.students[studentName]=emailAddress

    def getEmailList(self):
        emailLst=[]

        for student in self.students:
            output=student + " <" +self.students[student] + ">"
            emailLst.append(output)
        return emailLst
        
