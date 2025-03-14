class StaticScopeDemo { 
static int x = 5; 
public static void main(String[] args) { 
int x = 10; 
{ 
int x = 15; // Compilation Error 
System.out.println(x); } 
} 
} 