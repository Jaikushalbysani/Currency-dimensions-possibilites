import tkinter as tk
from tkinter import ttk

def coin_change(coins, target):
    # ... (rest of your code remains the same)

def solve_coin_change():
    # ... (rest of your code remains the same)

# Create the main window
window = tk.Tk()
window.title("Coin Change Problem Solver")

# Create a style object for ttk
style = ttk.Style()

# Configure the style for labels and buttons
style.configure('TLabel', font=('Arial', 12))
style.configure('TButton', font=('Arial', 12))

# Create input fields and labels
ttk.Label(window, text="Enter target amount:").pack()
target_entry = ttk.Entry(window)
target_entry.pack()

ttk.Label(window, text="Enter coin denominations (space-separated):").pack()
coins_entry = ttk.Entry(window)
coins_entry.pack()

# Create a button to solve the problem
solve_button = ttk.Button(window, text="Solve", command=solve_coin_change)
solve_button.pack()

# Create a style for the result label
style.configure('TResultLabel', font=('Arial', 12, 'bold'))

# Create a label to display the best possibility
result_label = ttk.Label(window, text="", style='TResultLabel')
result_label.pack()

# Start the Tkinter main loop
window.mainloop()
