import random
from colour import Color

colors = [ Color("blue"), Color("green"), Color("red"), Color("yellow"),
          Color("pink"), Color("Magenta") ]

class Board:
    
    
    def __init__(self, board_size):
        self.board = [board_size][board_size]

    def getColorAt(self, row, col):
        return self.board[row][col]

    def fillBoard(self):
        rng = random.randint(0, 5)
        for i in range(0, len(self.board)):
            for j in range(0, len(self.board)):
                self.board[i][j] = colors[rng]








