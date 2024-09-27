import pandas as pd

file_path = 'E:\\Mustafa\\Employees.csv'
df = pd.read_csv(file_path)


#                                       Step 1
df = df.drop_duplicates()


#                                       Step 2
df ['Age'] = df ['Age'].apply(lambda x: int(x) if pd.notnull(x) else x)


#                                       Step 3
conversionRate = 48.37
df ['Salary(EGP)'] = df ['Salary(USD)'] * conversionRate


#                                       Step 4
averageAge = df ['Age'].mean()
medianSalary = df ['Salary(EGP)'].median()
genderCounts = df ['Gender'].value_counts()
if 'M' in genderCounts and 'F' in genderCounts:
    genderRatio = genderCounts['M'] / genderCounts['F']
else:
    print(f"gender ration calculated incorrectly")

print(f"Average age : {averageAge}")
print(f"Median Salary : {medianSalary}")
print(f"Gender ratio : {genderRatio}")


#                                        Step 5
output_file_path = 'Updated Employees.csv'
df.to_csv(output_file_path, index=False)

