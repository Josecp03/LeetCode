import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("(){}}{"));  // Esto debería imprimir false
    }
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Si es un carácter de apertura, lo añadimos a la pila
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                // Si es un carácter de cierre, verificamos si la pila está vacía o si el
                // tope de la pila no coincide con el carácter de cierre actual
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Si la pila está vacía al final, significa que todos los caracteres
        // de apertura han sido correctamente emparejados y cerrados
        return stack.isEmpty();
    }
    
    
}