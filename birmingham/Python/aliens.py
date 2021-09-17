#字典列表
alien_0 = {'color':'green', 'points':5}
alien_1 = {'color':'yellow', 'points':10}
alien_2 = {'color':'red', 'point':15}

aliens = [alien_0, alien_1, alien_2]
for alien in aliens:
    print(alien)

aliens_random = []
for alien_number in range(30): #range(30) 代表重复循环多少次
    new_alien = {'color':'green', 'point':alien_number}
    aliens_random.append(new_alien)

for alien in aliens_random[:5]:
    print(alien)
print("...")

print(f"Total number of aliens: {len(aliens_random)}")
