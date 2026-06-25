from random import random

print("Pick a move: r, p, or s")
my_move = input("> ")

random_number = random()

if 0 <= random_number < 0.333:
  computer_move = "r"
elif 0.333 <= random_number < 0.666:
  computer_move = "p"
else:
  computer_move = "s"

print(computer_move)

if my_move == computer_move:
  print("Tie!")
elif my_move == "s" and computer_move == "p":
  print("You win, but not for long.....")
elif my_move == "p" and computer_move == "r":
  print("ugh your too good!")
elif my_move == "r" and computer_move == "s":
  print("i'll beat you next time!")
else:
  print("I win! ahahaha")
# TODO: the rest!!