# mazeGame
List player items: the player enters the list command without an argument, system displays the contents of the player’s inventory. 


List location- the player enters the list command with the word ‘location ‘as argument, a list of the items and non-player characters in the player’s current location is displayed.

Look Location – the player issues the look command without arguments and the system returns a description of the current player’s location

Look Exit – the player issues the look command with an argument and if the argument matches an exit a description of the exit is returned.

Get Item – the player enters the get command with an argument, if the argument matches an item in the player’s current location and the item does not exceed the player’s current weight carrying capacity and the player does not already possess the same item, the item is added to the player’s inventory. Get command does not work during combat or in a blacksmith’s shop.

Drop Item – the player issues a drop command with an argument, if the argument matches an item in the player’s inventory. The item is removed from the player inventory and added to the location inventory. The player’s weight carrying capacity is updated to reflect the removed item’s weight.

Equip Weapon – the player issues an equip command with an argument, if the argument matches an item in the player’s inventory that is of type weapon, then the weapon is equipped. Only one weapon can be equipped at a time.

Equip Shield – the player issues an equip command with an argument, if the argument matches an item in the player’s inventory that is of type shield, then the shield is equipped. Only one shield can be equipped at a time.

Equip Armor– the player issues an equip command with an argument, if the argument matches an item in the player’s inventory that is of type armor, then the armor is equipped. Only one armor can be equipped at a time.

Unequip Weapon – the player issues an unequip command with the word ‘weapon’ as an argument. If the player has a weapon equipped it is unequipped.

Unequip Shield – the player issues an unequip command with the word ‘shield’ as an argument. If the player has a shield equipped it is unequipped.

Unequip Armor – the player issues an unequip command with the word ‘armor’ as an argument. If the player has an armor equipped it is unequipped

Purchase Item – the player issues a buy command with an argument, if the argument matches an item in the vendor’s location (Blacksmith) and the weight of the item is with the player’s remaining weight carrying capacity and the cost of the item is covered by the player’s available gold coins, the item is added to the player’s inventory. The player’s weight carrying capacity and gold coins is updated to reflect the transaction accordingly.

Sell Item – players specify an item to buy within a blacksmith location, if the item exists in the players inventory, the item is removed and 80% of the item’s worth is added to the player’s gold coins. The player’s weight carrying capacity and gold coins is updated to reflect the transaction accordingly.

Attack – the player issues an attack command only when hostile non-player characters are present. The player randomly attacks a non-player character and the randomly attacked player attacks back and this completes an attack command.

Flee – the player issues a flee command and the player is taken back to the previous location. Flee command is only activated when a hostile character is within the player’s current location



