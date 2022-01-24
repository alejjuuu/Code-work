# create a list with days of the week

days = ['Sunday', 'Monday', 'Tuesday',
        'Wednesday', 'Thursday', 'Friday', 'Saturday']

minutes = []
total_minutes = 0


def append_value(dict_obj, key, value):
    # Check if key exist in dict or not
    if key in dict_obj:
        # Key exist in dict.
        # Check if type of value of key is list or not
        if not isinstance(dict_obj[key], list):
            # If type is not list then make it list
            dict_obj[key] = [dict_obj[key]]
        # Append the value in list
        dict_obj[key].append(value)
    else:
        # As key is not in dict,
        # so, add key-value pair
        dict_obj[key] = value


# prompt the user to enter the number of minutes for each day
# calculate the sum of the minutes for week
for x in range(6):
    value = input("Enter the number of minutes spent in " + days[x] + ": ")
    append_value(minutes, str(days[x]), value)
    total_minutes = minutes.values()
    total = sum(total_minutes)
    print("You have spent: " + total + " of your time please get the work done!")
