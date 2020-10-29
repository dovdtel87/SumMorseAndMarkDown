# SumMorseAndMarkDown

- **Language**: Kotlin  
- **IDE**: Android Studio  
## SUM:
I have decided to create a range from 1 to the given number and implement a filter on that list that meets the conditions given, then return the sum up of the filtered list. 

For help with the filtering, I have implemented a kotlin extension function in the Int class that says if a number is divisible by another number.

## MORSE:
I have created a map with the alphabet having the morse code as a key.
When calling the method, if the key doesn’t contain “?” look for it on the map.
In case it doesn’t exist return an empty string.
In case the key comes with “?” then I’ll explore recursively the 2 possible keys that could be produced replacing “?” for “.” or “-”.

## MARKDOWN:
I have implemented a regex that captures if the input has a valid format.
If it has a valid format I capture all the “#” and the text.
I count the number of hashes and I use a string format to return the correct html header.

For the three problems, I have added test cases that cover different corner cases of the problems. 
