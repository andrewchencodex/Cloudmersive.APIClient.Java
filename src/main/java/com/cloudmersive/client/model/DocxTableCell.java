/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.model.DocxParagraph;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A cell in a Word Document (DOCX) file
 */
@ApiModel(description = "A cell in a Word Document (DOCX) file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class DocxTableCell {
  @SerializedName("CellIndex")
  private Integer cellIndex = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("Paragraphs")
  private List<DocxParagraph> paragraphs = null;

  @SerializedName("CellShadingColor")
  private String cellShadingColor = null;

  @SerializedName("CellShadingFill")
  private String cellShadingFill = null;

  @SerializedName("CellShadingPattern")
  private String cellShadingPattern = null;

  @SerializedName("CellWidthMode")
  private String cellWidthMode = null;

  @SerializedName("CellWidth")
  private String cellWidth = null;

  public DocxTableCell cellIndex(Integer cellIndex) {
    this.cellIndex = cellIndex;
    return this;
  }

   /**
   * The index of the cell, 0-based
   * @return cellIndex
  **/
  @ApiModelProperty(value = "The index of the cell, 0-based")
  public Integer getCellIndex() {
    return cellIndex;
  }

  public void setCellIndex(Integer cellIndex) {
    this.cellIndex = cellIndex;
  }

  public DocxTableCell path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new tables
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new tables")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DocxTableCell paragraphs(List<DocxParagraph> paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

  public DocxTableCell addParagraphsItem(DocxParagraph paragraphsItem) {
    if (this.paragraphs == null) {
      this.paragraphs = new ArrayList<DocxParagraph>();
    }
    this.paragraphs.add(paragraphsItem);
    return this;
  }

   /**
   * Paragraphs inside the cell; this is where the contents of the cell are stored
   * @return paragraphs
  **/
  @ApiModelProperty(value = "Paragraphs inside the cell; this is where the contents of the cell are stored")
  public List<DocxParagraph> getParagraphs() {
    return paragraphs;
  }

  public void setParagraphs(List<DocxParagraph> paragraphs) {
    this.paragraphs = paragraphs;
  }

  public DocxTableCell cellShadingColor(String cellShadingColor) {
    this.cellShadingColor = cellShadingColor;
    return this;
  }

   /**
   * Color of the cell shading
   * @return cellShadingColor
  **/
  @ApiModelProperty(value = "Color of the cell shading")
  public String getCellShadingColor() {
    return cellShadingColor;
  }

  public void setCellShadingColor(String cellShadingColor) {
    this.cellShadingColor = cellShadingColor;
  }

  public DocxTableCell cellShadingFill(String cellShadingFill) {
    this.cellShadingFill = cellShadingFill;
    return this;
  }

   /**
   * Fill of the cell shading
   * @return cellShadingFill
  **/
  @ApiModelProperty(value = "Fill of the cell shading")
  public String getCellShadingFill() {
    return cellShadingFill;
  }

  public void setCellShadingFill(String cellShadingFill) {
    this.cellShadingFill = cellShadingFill;
  }

  public DocxTableCell cellShadingPattern(String cellShadingPattern) {
    this.cellShadingPattern = cellShadingPattern;
    return this;
  }

   /**
   * Pattern of the cell shading
   * @return cellShadingPattern
  **/
  @ApiModelProperty(value = "Pattern of the cell shading")
  public String getCellShadingPattern() {
    return cellShadingPattern;
  }

  public void setCellShadingPattern(String cellShadingPattern) {
    this.cellShadingPattern = cellShadingPattern;
  }

  public DocxTableCell cellWidthMode(String cellWidthMode) {
    this.cellWidthMode = cellWidthMode;
    return this;
  }

   /**
   * Width mode of the cell; can be auto (for automatic) or manual
   * @return cellWidthMode
  **/
  @ApiModelProperty(value = "Width mode of the cell; can be auto (for automatic) or manual")
  public String getCellWidthMode() {
    return cellWidthMode;
  }

  public void setCellWidthMode(String cellWidthMode) {
    this.cellWidthMode = cellWidthMode;
  }

  public DocxTableCell cellWidth(String cellWidth) {
    this.cellWidth = cellWidth;
    return this;
  }

   /**
   * Width of the cell
   * @return cellWidth
  **/
  @ApiModelProperty(value = "Width of the cell")
  public String getCellWidth() {
    return cellWidth;
  }

  public void setCellWidth(String cellWidth) {
    this.cellWidth = cellWidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTableCell docxTableCell = (DocxTableCell) o;
    return Objects.equals(this.cellIndex, docxTableCell.cellIndex) &&
        Objects.equals(this.path, docxTableCell.path) &&
        Objects.equals(this.paragraphs, docxTableCell.paragraphs) &&
        Objects.equals(this.cellShadingColor, docxTableCell.cellShadingColor) &&
        Objects.equals(this.cellShadingFill, docxTableCell.cellShadingFill) &&
        Objects.equals(this.cellShadingPattern, docxTableCell.cellShadingPattern) &&
        Objects.equals(this.cellWidthMode, docxTableCell.cellWidthMode) &&
        Objects.equals(this.cellWidth, docxTableCell.cellWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellIndex, path, paragraphs, cellShadingColor, cellShadingFill, cellShadingPattern, cellWidthMode, cellWidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTableCell {\n");
    
    sb.append("    cellIndex: ").append(toIndentedString(cellIndex)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
    sb.append("    cellShadingColor: ").append(toIndentedString(cellShadingColor)).append("\n");
    sb.append("    cellShadingFill: ").append(toIndentedString(cellShadingFill)).append("\n");
    sb.append("    cellShadingPattern: ").append(toIndentedString(cellShadingPattern)).append("\n");
    sb.append("    cellWidthMode: ").append(toIndentedString(cellWidthMode)).append("\n");
    sb.append("    cellWidth: ").append(toIndentedString(cellWidth)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

