#使用任意数量的关键字实参
def build_profile(first, last, **user_info):
	"""创建一个字典，其中包含我们知道的有关用户的一切"""
	user_info['first_name'] = first
	user_info['last_name'] = last
	return user_info

user_profile = build_profile('albert', 'einstein',
		location = 'princetion',
		field = 'physics')

print(user_profile)

#形参**user_info()中的两个星号让Python创建一个名为user_info的空字典，
#收到的所有名称值对都放到这个字典中
