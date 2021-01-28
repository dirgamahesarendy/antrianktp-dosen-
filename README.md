# antrianktp-dosen-

# NAMA ANGGOTA

-Dirga Wira Aditya 
-Mahesa Yudhistira 
-Rendy Fitra Adi Pratama 

# CLASS DIAGRAM
```mermaid
classDiagram
    AccountHolder <|-- IndividualHolder
    AccountHolder <|-- CorporateHolder
     AccountHolder "1"--o"*" Rekaman : has

    class AccountHolder{
    <<abstract>>
    #int ID
    #String name
    #String address
    #String email
    }
    class IndividualHolder{
     -String status
    }
    class CorporateHolder{
     -String statusrek
    }
    class Rekaman{
      -int idrek
      -String classrek
      -String perekam
    }
```

# ER DIAGRAM
```mermaid
erDiagram
          ACCOUNTHOLDER ||..|| INDIVIDUAL-HOLDER : is
          ACCOUNTHOLDER ||--|| CORPORATE-HOLDER : is
          ACCOUNTHOLDER ||--|{ REKAMAN: "has"
          ACCOUNTHOLDER {
            int id
            string name
            string adress
            string email
          }
          INDIVIDUAL-HOLDER{
            string status
          }
          CORPORATE-HOLDER{
            string statusrek
          }
           CLASS{
            int idrek
            string classrek
            string perekam
          }
```          
