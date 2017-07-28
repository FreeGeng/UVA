#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct _node
{
    int data;
    struct _node *next;

} Node;


Node* insert(int data,Node* tail,Node *head)
{
    if(tail==NULL)
    {
        tail = malloc(sizeof(Node));
        tail->data = data;
        tail ->next = NULL;
        return tail;
    }

    else
    {
        Node *temp = malloc(sizeof(Node));
        temp->data=data;
        temp->next = NULL;
        tail->next = temp;
        tail = temp;
        return tail;
    }

}

Node* pop(Node *head)
{
    if(head==NULL)
    {
        printf("You can't pop!!");
        return head;
    }
    else
    {
        printf("%d\n",head->data);
        Node *temp = head;
        head = head->next;
        free(temp);
        return head;
    }
}

void print(Node *head)
{
    Node *temp = head;
    if(temp == NULL){
        printf("queue is empty!\n");
    }

    while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }
}


int main(void)
{
    Node *head= NULL;
    Node *tail= NULL;

    while(1)
    {
        char a[10]={0};
        scanf("%s",a);
        if(strcmp(a,"insert")==0)
        {
            int data = 0;
            scanf("%d",&data);
            tail = insert(data,tail,head);
            if(head==NULL){
                head=tail;
            }
        }
        else if(strcmp(a,"pop")==0)
        {
            head = pop(head);
        }
        else if(strcmp(a,"print")==0)
        {
            print(head);
        }
    }
    return 0;
}
