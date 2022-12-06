package com.nissan.util;

import java.text.ParseException;
import java.time.LocalDate;

import com.nissan.exception.AssetCustomException;
import com.nissan.pojo.Asset;

public class AssetValidationUtil {

	public static Asset setAssetDetails(String computerName, String brandName,
			String manufactureDate, boolean isAvailable, int quantity)
			throws AssetCustomException, ParseException, NumberFormatException {
		Asset asset = new Asset(validateComputerName(computerName),
				validateBrandName(brandName), validateDate(manufactureDate),
				isAvailable, validateQuantity(quantity));
		return asset;
	}

	private static String validateComputerName(String computerName)
			throws AssetCustomException {
		if (computerName.length() > 30) {
			throw new AssetCustomException(
					"Computer name length can't be greater than 30 characters");
		}
		return computerName;
	}

	private static String validateBrandName(String brandName)
			throws AssetCustomException {
		if (brandName.length() > 20) {
			throw new AssetCustomException(
					"Brand name length can't be greater than 20 characters");
		}
		return brandName;
	}

	private static LocalDate validateDate(String date)
			throws AssetCustomException, ParseException {
		LocalDate manfDate = LocalDate.parse(date);

		if (manfDate.isAfter(LocalDate.now())) {
			throw new AssetCustomException(
					"Manufacture date can't be from the future date");
		}
		return manfDate;
	}

	private static int validateQuantity(int quantity)
			throws AssetCustomException, NumberFormatException {
		if (quantity < 0) {
			throw new AssetCustomException("Quantity can't be in negative");
		}
		return quantity;
	}
}
