package de.ait.mapper;

import de.ait.*;
import de.ait.model.CsvRowModel;
import de.ait.model.Transaction;
import de.ait.models.OperationTyp;
import de.ait.models.TransaktionCode;
import de.ait.models.TransaktionTyp;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 24.06.2023
 */
public class TransactionMapper {

    private TransactionMapper() {
    }

    public static Transaction mapToTransaction(CsvRowModel model) {
        List<String> errors = model.getErrors();

        Converter<TransaktionTyp> transaktionTypConverter = new TransaktionTypConverter();
        Converter<OperationTyp> operationTypConverter = new OperationTypConverter();
        Converter<TransaktionCode> transaktionCodeConverter = new TransaktionCodeConverter();
        Converter<Long> longConverter = new LongConverter();
        Converter<Integer> integerConverter = new IntConverter();
        Converter<Double> doubleConverter = new DoubleConverter();
        Converter<LocalDateTime> localDataTimeConverter = new LocalDataTimeConverter();
        Converter<String> stringConverter = new StringConverter();

        Transaction transaction = new Transaction(
                transaktionTypConverter.convert(
                        model.getTransaktionTypKey(),
                        "TRANSAKTION_TYP_KEY",
                        errors,
                        true
                ),
                operationTypConverter.convert(
                        model.getOperationTypKey(),
                        "OPERATION_TYP_KEY",
                        errors,
                        true
                ),
                transaktionCodeConverter.convert(
                        model.getTransactionsCode(),
                        "TRANSACTIONS_CODE",
                        errors,
                        true
                ),
                longConverter.convert(
                        model.getTransaktionNr(),
                        "TRANSAKTION_NUMMER",
                        errors,
                        true
                ),
                integerConverter.convert(
                        model.getAdditionalTransaktionNr(),
                        "ADDITIONAL_TRANSAKTION_NUMBER",
                        errors,
                        true
                ),
                doubleConverter.convert(
                        model.getBetrag(),
                        "BETRAG",
                        errors,
                        true
                ),
                integerConverter.convert(
                        model.getCurrency(),
                        "CURRENCY",
                        errors,
                        true
                ),
                localDataTimeConverter.convert(
                        model.getTransDatum(),
                        "TRANS_DATUM",
                        errors,
                        true
                ),
                localDataTimeConverter.convert(
                        model.getValuta(),
                        "VALUTA",
                        errors,
                        true
                ),
                stringConverter.convert(
                        model.getBemerkung1(),
                        "BEMERKUNG1",
                        errors,
                        true
                ),
                stringConverter.convert(
                        model.getBemerkung2(),
                        "BEMERKUNG2",
                        errors,
                        true
                )
        );


        return transaction;
    }
}
