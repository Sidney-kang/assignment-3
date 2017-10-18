#Created by : Sidney Kang
#Created on : 1 Oct. 2017
#Created for : ICS3UR
# Weekly Assignment - Assignment #3
# This program calculates the cost of an order of a large or extra large pizza 
#   with a maximum of 4 toppings.

import ui

def calculate_cost_of_pizza_touch_up_inside(sender):
    #This calculates the cost of pizza
    
    #constants
    HST = 0.13
    
    #input
    pizza_size = float(view['chosen_size_textbox'].text) 
    number_of_toppings = float(view['number_of_toppings_textbox'].text) 

    #process
    if pizza_size == 1:
       subtotal = 6.00
    elif pizza_size == 2:
       subtotal = 10.00
    
    if number_of_toppings == 1:
       subtotal = subtotal + 1.00
    elif number_of_toppings == 2:
       subtotal = subtotal + 1.75
    elif number_of_toppings == 3:
       subtotal = subtotal + 2.50
    elif number_of_toppings == 4:
       subtotal = subtotal + 3.25
    
    final_HST = HST * subtotal
    total_cost = subtotal + final_HST

    #output
    view['subtotal_label'].text = "Sub Total: " + "${:,.2f}".format((((subtotal* 100.0) + 0.5)/100.0))
    view['hst_label'].text = "HST: "+ "${:,.2f}".format((((final_HST * 100.0) + 0.5)/100.0))
    view['total_cost_label'].text = "Total Cost: " + "${:,.2f}".format((((total_cost * 100.0) + 0.5)/100.0))

view = ui.load_view()
view.present('full_screen')
