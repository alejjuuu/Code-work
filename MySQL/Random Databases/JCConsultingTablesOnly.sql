
CREATE TABLE tblCategories (
  CategoryID VARCHAR(15) NOT NULL, 
  PRIMARY KEY (CategoryID));

CREATE TABLE tblZips (
  City VARCHAR(255), 
  Zip VARCHAR(255) NOT NULL, 
  PRIMARY KEY (Zip));

CREATE TABLE tblClients (
  ClientID INTEGER, 
  ClientName VARCHAR(35), 
  Street VARCHAR(25), 
  Zip VARCHAR(5), 
  Government INTEGER(1), 
  PRIMARY KEY (ClientID),
  FOREIGN KEY (ZIP) references tblZips(Zip));

CREATE TABLE tblEmployees (
  EmployeeID VARCHAR(2), 
  LastName VARCHAR(15), 
  FirstName VARCHAR(15), 
  HireDate DATETIME, 
  Title VARCHAR(255), 
  Salary DECIMAL(19,4),
  PRIMARY KEY (EmployeeID));

CREATE TABLE tblProjects (
  ProjectID INTEGER, 
  ProjectStartDate DATETIME, 
  ClientID INTEGER, 
  EmployeeID VARCHAR(255), 
  ProjectNotes VARCHAR(100),
  PRIMARY KEY (ProjectID),
  FOREIGN KEY (EmployeeID) references tblEmployees(EmployeeID),
  FOREIGN KEY (ClientID) references tblClients(ClientID));

CREATE TABLE tblTaskMasterList (
  TaskID VARCHAR(6) NOT NULL, 
  Description VARCHAR(30), 
  CategoryID VARCHAR(15), 
  Per VARCHAR(255), 
  Estimate DECIMAL(19,4), 
  PRIMARY KEY (TaskID),
  FOREIGN KEY (CategoryID) references tblCategories (CategoryID));

CREATE TABLE tblProjectLineItems (
  ProjectLineItemID INTEGER, 
  ProjectID INTEGER NOT NULL, 
  TaskID VARCHAR(255) NOT NULL, 
  TaskDate DATETIME, 
  Quantity INTEGER, 
  Factor DECIMAL(4,2), 
  ProjectLineItemNotes VARCHAR(100), 
  PRIMARY KEY (ProjectLineItemID),
  FOREIGN KEY (ProjectID) references tblProjects(ProjectID),
  FOREIGN KEY (TaskID) references tblTaskMasterList(TaskID));

