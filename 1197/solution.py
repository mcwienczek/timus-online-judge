import sys, math
knights = []

chars_to_nums = {
    'a': 1,
    'b': 2,
    'c': 3,
    'd': 4,
    'e': 5,
    'f': 6,
    'g': 7,
    'h': 8
    }

def translate_char_to_number(pos):
    pos_x = chars_to_nums[pos[0]]
    pos_y = int(pos[1])
    return [pos_x, pos_y]

def calculate_movements(pos):
    num_of_movements = 8
    if pos[0] + 2 > 8 or pos[1] + 1 > 8:
        num_of_movements -= 1
    if pos[0] + 2 > 8 or pos[1] - 1 < 1:
        num_of_movements -= 1
    if pos[0] + 1 > 8 or pos[1] + 2 > 8:
        num_of_movements -= 1
    if pos[0] + 1 > 8 or pos[1] - 2 < 1:
        num_of_movements -= 1
    if pos[0] - 2  < 1 or pos[1] + 1 > 8:
        num_of_movements -= 1
    if pos[0] - 2 < 1 or pos[1] - 1 < 1:
        num_of_movements -= 1
    if pos[0] - 1 < 1 or pos[1] + 2 > 8:
        num_of_movements -= 1
    if pos[0] - 1 < 1 or pos[1] - 2 < 1:
        num_of_movements -= 1
    return num_of_movements

no_of_knights = int(sys.stdin.readline())
knights_pos_str = []
for i in range(0, no_of_knights):
    knights_pos_str.append(sys.stdin.readline())
    
for pos in knights_pos_str:
    knight_pos = translate_char_to_number(pos)
    no_movements = calculate_movements(knight_pos)
    print(no_movements)

