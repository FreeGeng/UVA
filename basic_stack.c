#include <stdio.h>
#include <stdlib.h>
#include <string.h>


typedef struct _Node
{
    int data;
    struct _Node *next;
} Node;


Node* push(int data,Node *head)
{
    if(head == NULL)
    {
        Node *head = malloc(sizeof(Node));
        head -> data = data;
        head -> next = NULL;
        return head;
    }
    else
    {
        Node *top = malloc(sizeof(Node));
        top ->data=data;
        top ->next=head;
        head = top;
        return head;
    }
}

Node* pop(Node *head)
{
    printf("%d\n",head->data);
    Node *temp = head;
    head = head->next;
    free(temp);
    return head;
}

void printStack(Node *head)
{
    Node *temp = head;
    while(temp!= NULL)
    {
        printf("%d ",temp->data);
        temp = temp->next;
    }

}

int main(void)
{
    Node *head = NULL;
    while(1)
    {
        char a[10];
        scanf("%s",a);
        if(strcmp(a,"push")==0)
        {

            int input = 0;
            scanf("%d",&input);

            if(head == NULL)
            {
                head = push(input,NULL);
            }
            else
            {
                head = push(input,head);
            }
        }
        else if(strcmp(a,"print")==0){
            if(head!=NULL){
                printStack(head);
            }
            else{
                printf("stack is empty\n");
            }
        }
        else if(strcmp(a,"pop")==0){
            if(head == NULL){
                printf("You can't pop! ");
            }
            else{
                head = pop(head);
            }
        }
    }

    return 0;
}
