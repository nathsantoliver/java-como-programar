package chap21.tree;

public class TreeNode<T extends Comparable<T>> {

    // membros de acesso de pacote
    TreeNode<T> leftNode;
    T data; // valor do nó
    TreeNode<T> rightNode;

    // construtor inicializa os dados e os torna um nó de folha
    public TreeNode(T nodeData) {
        data = nodeData;
        leftNode = rightNode = null;    // o nó não tem nenhum filho
    }

    // localiza ponto de inserção e insere novo nó; ignora os valores duplicados
    public void insert(T insertValue) {
        // insere na subárvore esquerda
        if (insertValue.compareTo(data) < 0) {  // caso o valor seja menor, retornará '-1'

            // insere novo TreeNode
            if (leftNode == null) {
                leftNode = new TreeNode<T>(insertValue);
            } else {    // continua percorrendo a subárvore esquerda recursivamente
                leftNode.insert(insertValue);
            }

        } else if (insertValue.compareTo(data) > 0) {  // insere na subárvore direita

            // insere novo TreeNode
            if (rightNode == null) {
                rightNode = new TreeNode<T>(insertValue);
            } else {    // continua percorrendo a subárvore esquerda recursivamente
                rightNode.insert(insertValue);
            }

        }
    }

}
