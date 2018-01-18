package learning.groovy.collections

def beatles = ["John", "Paul", "George", "Ringo"]

def i = 0
for(String s: beatles)
{
	def hello = "Hello "
	
	//Print individual item in array
	println s
	
	// $ takes precedence and hence the entire array will be printed 
	println "$beatles"
	
	// proper use of $
	println "$hello"+"${beatles[i++]}"
	
}
