#Final PE1 - Class state
class State:
      '''this manages universities by state'''

      def __init__(self,name):
            self.name=name
            self.universities=[]

      def add_university(self,uni_name):
            '''add new uni_name to the list'''
            if (uni_name not in self.universities):
                  self.universities.append(uni_name)
                  
      def is_home_of(self, uni_name):
            ''' checks if uni_name is in the list'''
            
            if (uni_name in self.universities):
                  return True
            else:
                  return False
     
