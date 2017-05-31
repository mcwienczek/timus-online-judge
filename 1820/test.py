import subprocess

with open('tests.txt') as fp:
    for line in fp:
        items = line.split()
        process = subprocess.Popen("""main << TEST
        2 5
        TEST""", stdout=subprocess.PIPE)
        output, error = process.communicate()
