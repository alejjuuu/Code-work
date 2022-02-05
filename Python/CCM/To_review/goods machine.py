prices = {'coffe': 3.00, 'waterwithgas': 2.00, 'costomilk': 3.00}
orders = {'coffe': 1, 'waterwithgas': 2, 'costomilk': 3}


purchase = input('what would like to buy please enter the number: ')
sum = 0
prices[purchase]
for x in prices:
    print(x, end='')
   # sum = orders[x]*prices[x]

prices = {"candy": 1, "socks": 2, "boat": 3, "apple": 4}
orders = {"candy": 5, "socks": 5, "boat": 5, "apple": 5}


for ch in prices:
    print(ch, end=' ')
    sum = orders[ch]*prices[ch]
print(sum)

for key in prices:
    print(prices[key], orders[key])
    sum = sum + prices[key]*orders[key]
print(round(sum, 2))
main()
