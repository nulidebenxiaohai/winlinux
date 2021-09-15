favorite_language = {
        'jen': 'python',
        'sarah': 'c',
        'edward': 'ruby',
        'phil': 'python',}
for key, value in favorite_language.items():
    print(f"\nKey: {key}")
    print(f"Vaule: {value}")

for name in favorite_language.keys():
    print(f"\nNmae: {name}")

for language in set(favorite_language.values()):
    print(f"\nLanguage: {language}")
