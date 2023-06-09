package de.ait.model;

import java.time.LocalDateTime;

/**
 * @author Andrej Reutow
 * created on 16.06.2023
 */
public class Transaction {

    private TransaktionTyp transaktionTypKey;
    private OperationTyp operationTypKey;
    private TransaktionCode transactionsCode;
    private Long transaktionNummer;
    private Integer additionalTransaktionNumber;
    private Double betrag;
    private Integer currency;
    private Integer kontonr;
    private Integer blz;
    private LocalDateTime transDatum;
    private LocalDateTime valuta;
    private Integer mandatReferenz;
    private Integer kundeId;
    private String vw1;
    private String vw2;
    private String bemerkung1;
    private String bemerkung2;
    private String bemerkung3;


    public Transaction() {
    }

    public Transaction(TransaktionTyp transaktionTypKey, OperationTyp operationTypKey, TransaktionCode transactionsCode, Long transaktionNummer, Integer additionalTransaktionNumber, Double betrag, Integer currency, Integer kontonr, Integer blz, LocalDateTime transDatum, LocalDateTime valuta, Integer mandatReferenz, Integer kundeId, String vw1, String vw2, String bemerkung1, String bemerkung2, String bemerkung3) {
        this.transaktionTypKey = transaktionTypKey;
        this.operationTypKey = operationTypKey;
        this.transactionsCode = transactionsCode;
        this.transaktionNummer = transaktionNummer;
        this.additionalTransaktionNumber = additionalTransaktionNumber;
        this.betrag = betrag;
        this.currency = currency;
        this.kontonr = kontonr;
        this.blz = blz;
        this.transDatum = transDatum;
        this.valuta = valuta;
        this.mandatReferenz = mandatReferenz;
        this.kundeId = kundeId;
        this.vw1 = vw1;
        this.vw2 = vw2;
        this.bemerkung1 = bemerkung1;
        this.bemerkung2 = bemerkung2;
        this.bemerkung3 = bemerkung3;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transaktionTypKey=" + transaktionTypKey +
                ", operationTypKey=" + operationTypKey +
                ", transactionsCode=" + transactionsCode +
                ", transaktionNummer=" + transaktionNummer +
                ", additionalTransaktionNumber=" + additionalTransaktionNumber +
                ", betrag=" + betrag +
                ", currency=" + currency +
                ", kontonr=" + kontonr +
                ", blz=" + blz +
                ", transDatum=" + transDatum +
                ", valuta=" + valuta +
                ", mandateferenz=" + mandatReferenz +
                ", kundeId=" + kundeId +
                ", vw1='" + vw1 + '\'' +
                ", vw2='" + vw2 + '\'' +
                ", bemerkung1='" + bemerkung1 + '\'' +
                ", bemerkung2='" + bemerkung2 + '\'' +
                ", bemerkung3='" + bemerkung3 + '\'' +
                '}';
    }
}
