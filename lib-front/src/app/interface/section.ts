import { Book } from "./book";

export interface Section {
    id: number;
    name: string;
    description: string;
    booksList: Book[];
    total: number;
}
