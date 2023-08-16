weight = input('weight= ')
kg_lbs = input('kg(k) or lbs(l)= ')
if kg_lbs.upper() == 'L':
  print('weight in kg= ', int(weight)*0.45)
elif kg_lbs.upper() == 'K':
  print('weight in lbs= ', int(weight)/0.45)
else:
  print('enter a correct input, thankyou')