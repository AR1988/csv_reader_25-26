package de.ait.model;

/**
 * @author Andrej Reutow
 * created on 10.06.2023
 */
public class CsvRowModel {

    private int rowNr;
    private String table;
    private String transaktion_typ_key;
    private String operation_typ_key;
    private String transactions_code;
    private String transaktion_nummer;
    private String additional_transaktion_number;
    private String betrag;
    private String currency;
    private String kontonr;
    private String blz;
    private String trans_datum;
    private String valuta;
    private String mandateferenz;
    private String kunde_id;
    private String vw_1;
    private String vw_2;
    private String bemerkung_1;
    private String bemerkung_2;
    private String bemerkung_3;


    public CsvRowModel(int rowNr,
                       String table,
                       String transaktion_typ_key,
                       String operation_typ_key,
                       String transactions_code,
                       String transaktion_nummer,
                       String additional_transaktion_number,
                       String betrag,
                       String currency,
                       String kontonr,
                       String blz,
                       String trans_datum,
                       String valuta,
                       String mandateferenz,
                       String kunde_id,
                       String vw_1,
                       String vw_2,
                       String bemerkung_1,
                       String bemerkung_2,
                       String bemerkung_3) {
        this.rowNr = rowNr;
        this.table = table;
        this.transaktion_typ_key = transaktion_typ_key;
        this.operation_typ_key = operation_typ_key;
        this.transactions_code = transactions_code;
        this.transaktion_nummer = transaktion_nummer;
        this.additional_transaktion_number = additional_transaktion_number;
        this.betrag = betrag;
        this.currency = currency;
        this.kontonr = kontonr;
        this.blz = blz;
        this.trans_datum = trans_datum;
        this.valuta = valuta;
        this.mandateferenz = mandateferenz;
        this.kunde_id = kunde_id;
        this.vw_1 = vw_1;
        this.vw_2 = vw_2;
        this.bemerkung_1 = bemerkung_1;
        this.bemerkung_2 = bemerkung_2;
        this.bemerkung_3 = bemerkung_3;
    }

    public int getRowNr() {
        return rowNr;
    }

    public void setRowNr(int rowNr) {
        this.rowNr = rowNr;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getTransaktion_typ_key() {
        return transaktion_typ_key;
    }

    public void setTransaktion_typ_key(String transaktion_typ_key) {
        this.transaktion_typ_key = transaktion_typ_key;
    }

    public String getOperation_typ_key() {
        return operation_typ_key;
    }

    public void setOperation_typ_key(String operation_typ_key) {
        this.operation_typ_key = operation_typ_key;
    }

    public String getTransactions_code() {
        return transactions_code;
    }

    public void setTransactions_code(String transactions_code) {
        this.transactions_code = transactions_code;
    }

    public String getTransaktion_nummer() {
        return transaktion_nummer;
    }

    public void setTransaktion_nummer(String transaktion_nummer) {
        this.transaktion_nummer = transaktion_nummer;
    }

    public String getAdditional_transaktion_number() {
        return additional_transaktion_number;
    }

    public void setAdditional_transaktion_number(String additional_transaktion_number) {
        this.additional_transaktion_number = additional_transaktion_number;
    }

    public String getBetrag() {
        return betrag;
    }

    public void setBetrag(String betrag) {
        this.betrag = betrag;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getKontonr() {
        return kontonr;
    }

    public void setKontonr(String kontonr) {
        this.kontonr = kontonr;
    }

    public String getBlz() {
        return blz;
    }

    public void setBlz(String blz) {
        this.blz = blz;
    }

    public String getTrans_datum() {
        return trans_datum;
    }

    public void setTrans_datum(String trans_datum) {
        this.trans_datum = trans_datum;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public String getMandateferenz() {
        return mandateferenz;
    }

    public void setMandateferenz(String mandateferenz) {
        this.mandateferenz = mandateferenz;
    }

    public String getKunde_id() {
        return kunde_id;
    }

    public void setKunde_id(String kunde_id) {
        this.kunde_id = kunde_id;
    }

    public String getVw_1() {
        return vw_1;
    }

    public void setVw_1(String vw_1) {
        this.vw_1 = vw_1;
    }

    public String getVw_2() {
        return vw_2;
    }

    public void setVw_2(String vw_2) {
        this.vw_2 = vw_2;
    }

    public String getBemerkung_1() {
        return bemerkung_1;
    }

    public void setBemerkung_1(String bemerkung_1) {
        this.bemerkung_1 = bemerkung_1;
    }

    public String getBemerkung_2() {
        return bemerkung_2;
    }

    public void setBemerkung_2(String bemerkung_2) {
        this.bemerkung_2 = bemerkung_2;
    }

    public String getBemerkung_3() {
        return bemerkung_3;
    }

    public void setBemerkung_3(String bemerkung_3) {
        this.bemerkung_3 = bemerkung_3;
    }

    @Override
    public String toString() {
        return "CsvRowModel{" +
                "rowNr=" + rowNr +
                ", table='" + table + '\'' +
                ", transaktion_typ_key='" + transaktion_typ_key + '\'' +
                ", operation_typ_key='" + operation_typ_key + '\'' +
                ", transactions_code='" + transactions_code + '\'' +
                ", transaktion_nummer='" + transaktion_nummer + '\'' +
                ", additional_transaktion_number='" + additional_transaktion_number + '\'' +
                ", betrag='" + betrag + '\'' +
                ", currency='" + currency + '\'' +
                ", kontonr='" + kontonr + '\'' +
                ", blz='" + blz + '\'' +
                ", trans_datum='" + trans_datum + '\'' +
                ", valuta='" + valuta + '\'' +
                ", mandateferenz='" + mandateferenz + '\'' +
                ", kunde_id='" + kunde_id + '\'' +
                ", vw_1='" + vw_1 + '\'' +
                ", vw_2='" + vw_2 + '\'' +
                ", bemerkung_1='" + bemerkung_1 + '\'' +
                ", bemerkung_2='" + bemerkung_2 + '\'' +
                ", bemerkung_3='" + bemerkung_3 + '\'' +
                '}';
    }
}
