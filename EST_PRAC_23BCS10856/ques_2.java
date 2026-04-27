
// SRP Violation Example

class transaction{

    void deposit(double amount){
        // code to deposit money
    }
    void saveTransactionDetails(){
        // code to save transaction details to database
    }
};

// SRP not violated

class transaction{
    void deposit(double amount){
        // code to deposit money
    }
}

class TransactionRepository{
    void saveTransactionDetails(){
        // code to save transaction details to database
    }
}