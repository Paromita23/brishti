export class Wallet {
    constructor(
        public walletId : number,
        public walletType : string,
        public walletAmount : number,
        public customerId : number,
        // public vendorEmail : string
    ) {}
}
