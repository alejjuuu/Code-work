
#get the day
dateStr = input("Enter a date (mm/dd/yyyy): ")

#split into componets
monthStr,dayStr, yearStr = dateStr.split("/")

#convert monthStr to the month name
months = ["January", "February", "March", "April",
          "May", "June","July","August","September",
          "Octuber","November","December"]
monthStr = months[int(monthStr)-1]
#output result in month day, year format
print("The converted date is: ", monthStr,dayStr+",",yearStr)
